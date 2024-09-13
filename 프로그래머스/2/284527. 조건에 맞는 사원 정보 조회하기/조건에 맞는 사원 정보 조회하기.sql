-- 코드를 작성해주세요
SELECT SUM(HG.SCORE) AS SCORE, HE.EMP_NO, HE.EMP_NAME, HE.POSITION, HE.EMAIL
FROM HR_EMPLOYEES HE JOIN HR_GRADE HG
ON HE.EMP_NO = HG.EMP_NO
GROUP BY HE.EMP_NO
ORDER BY SUM(HG.SCORE) DESC
LIMIT 1