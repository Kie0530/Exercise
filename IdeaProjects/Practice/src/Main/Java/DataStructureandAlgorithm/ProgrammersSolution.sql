/** 프로그래머스 '코딩테스트 연습 > SELECT' 답안 모음 */

-- 모든 레코드 조회하기
select * from ANIMAL_INS order by ANIMAL_ID

-- 역순 정렬하기
select NAME, DATETIME from ANIMAL_INS order by ANIMAL_ID desc

-- 아픈 동물 찾기
select ANIMAL_ID, NAME from ANIMAL_INS where INTAKE_CONDITION='Sick'

-- 어린 동물 찾기
select ANIMAL_ID, NAME from ANIMAL_INS where INTAKE_CONDITION!='Aged'

-- 동물의 아이디와 이름
select ANIMAL_ID, NAME from ANIMAL_INS order by ANIMAL_ID

-- 여러 기준으로 정렬하기
select ANIMAL_ID, NAME, DATETIME from ANIMAL_INS order by NAME, DATETIME desc

-- 상위 n개 레코드
select NAME from ANIMAL_INS order by DATETIME asc LIMIT 1

-- 조건에 맞는 회원수 구하기
select count(*) as USERS from USER_INFO where AGE>=20 and AGE<=29 and YEAR(JOINED)=2021


/** 프로그래머스 '코딩테스트 연습 > SUM, MAX, MIN' 답안 모음 */

--가장 비싼 상품 구하기
select PRICE as MAX_PRICE from PRODUCT order by PRICE desc LIMIT 1
select max(PRICE) as MAX_PRICE from PRODUCT

-- 최댓값 구하기
select max(DATETIME) from ANIMAL_INS

-- 최솟값 구하기
select min(DATETIME) from ANIMAL_INS

-- 동물 수 구하기
select count(*) as count from ANIMAL_INS

-- 중복 제거하기
select count(distinct NAME) as count from ANIMAL_INS

/** 프로그래머스 '코딩테스트 연습 > GROUP BY' 답안 모음 */

-- 즐겨찾기가 가장 많은 식당 정보 출력하기
select A.FOOD_TYPE, A.REST_ID, A.REST_NAME, A.FAVORITES from REST_INFO A
join(select FOOD_TYPE, max(FAVORITES) as FAVORITES
     from REST_INFO group by FOOD_TYPE) B
on A.FOOD_TYPE = B.FOOD_TYPE and A.FAVORITES = B.FAVORITES
order by FOOD_TYPE desc

-- 고양이와 개는 몇 마리 있을까
SELECT ANIMAL_TYPE, COUNT(ANIMAL_TYPE)
FROM ANIMAL_INS
GROUP BY ANIMAL_TYPE
ORDER BY ANIMAL_TYPE

-- 동명 동물 수 찾기
SELECT NAME, COUNT(NAME) as count FROM ANIMAL_INS
GROUP BY NAME
HAVING COUNT(NAME)>=2
ORDER BY NAME

-- 성분으로 구분한 아이스크림 총 주문량
SELECT INGREDIENT_TYPE, SUM(TOTAL_ORDER) AS TOTAL_ORDER
FROM FIRST_HALF A, ICECREAM_INFO B
WHERE A.FLAVOR = B.FLAVOR
GROUP BY INGREDIENT_TYPE
ORDER BY TOTAL_ORDER ASC

-- 진료과별 총 예약 횟수 출력하기
SELECT MCDP_CD AS 진료과코드, COUNT(MONTH(APNT_YMD)) AS 5월예약건수
FROM APPOINTMENT
WHERE MONTH(APNT_YMD)=5
GROUP BY 진료과코드
ORDER BY 5월예약건수, 진료과코드