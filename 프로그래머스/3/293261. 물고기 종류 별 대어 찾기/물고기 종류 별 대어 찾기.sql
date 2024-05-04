-- 코드를 작성해주세요

SELECT ID, FISH_NAME, LENGTH
FROM FISH_INFO F JOIN FISH_NAME_INFO N USING(FISH_TYPE)
WHERE FISH_TYPE IN (
    SELECT FI.FISH_TYPE
    FROM FISH_INFO FI
    GROUP BY FI.FISH_TYPE
    HAVING LENGTH = MAX(FI.LENGTH)
)
ORDER BY ID
