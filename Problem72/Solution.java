/**
 * @author tgorthi
 * @since Jun 2020
 */
public class Solution
{
    public int minDistance(String word1, String word2)
    {
        int[][] dp = new int[word1.length() + 1][word2.length() + 1];        //Number of Operation to Convert word1
        // to Empty String. (Deletes Required)        for (int i = 0; i <= word1.length(); i++)        {
        // dp[i][0] = i;        }        //Number of Operation to Convert Empty String to word2. (Inserts Required)
        // for (int i = 0; i <= word2.length(); i++)        {            dp[0][i] = i;        }        for (int i =
        // 1; i <= word1.length(); i++)        {            for (int j = 1; j <= word2.length(); j++)            {
        // dp[i][j] = word1.charAt(i - 1) == word2.charAt(j - 1) ? dp[i - 1][j - 1] : Math.min(dp[i - 1][j - 1], Math
        // .min(dp[i - 1][j], dp[i][j - 1])) + 1;            }        }        return dp[word1.length()][word2.length
        // ()];    }}