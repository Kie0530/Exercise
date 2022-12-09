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
select ANIMAL_TYPE, count(ANIMAL_TYPE)
from ANIMAL_INS
group by ANIMAL_TYPE
order by ANIMAL_TYPE

-- 동명 동물 수 찾기
select NAME, count(NAME) as count from ANIMAL_INS
group by NAME
having count(NAME)>=2
order by NAME

-- 성분으로 구분한 아이스크림 총 주문량
select INGREDIENT_TYPE, sum(TOTAL_ORDER) as TOTAL_ORDER
from FIRST_HALF A, ICECREAM_INFO B
where A.FLAVOR = B.FLAVOR
group by INGREDIENT_TYPE
order by TOTAL_ORDER asc

-- 진료과별 총 예약 횟수 출력하기
select MCDP_CD as 진료과코드, count(MONTH(APNT_YMD)) as 5월예약건수
FROM APPOINTMENT
where MONTH(APNT_YMD)=5
group by 진료과코드
order by 5월예약건수, 진료과코드

-- 가격대 별 상품 개수 구하기
select TRUNCATE(PRICE, -4) as PRICE_GROUP, count(PRODUCT_ID) as PRODUCTS
from PRODUCT
group by PRICE_GROUP
order by PRICE_GROUP

-- 입양 시각 구하기(1)
SELECT HOUR(DATETIME) AS HOUR, COUNT(ANIMAL_ID) AS COUNT
FROM ANIMAL_OUTS
WHERE HOUR(DATETIME) >= 9 AND HOUR(DATETIME) <= 19
GROUP BY HOUR
ORDER BY HOUR

-- 입양 시각 구하기(2)
SET @hour := -1;
SELECT (@hour := @hour+1) AS HOUR,
(SELECT COUNT(ANIMAL_ID) FROM ANIMAL_OUTS WHERE HOUR(DATETIME)=@hour) AS COUNT
FROM ANIMAL_OUTS
WHERE @hour < 23

-- 년, 월, 성별 별 상품 구매 회원 수 구하기

