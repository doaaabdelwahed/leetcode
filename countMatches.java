class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
         int count = 0;
        int index = 0;

        // Map the ruleKey to the corresponding index
        if (ruleKey.equals("type")) {
            index = 0;
        } else if (ruleKey.equals("color")) {
            index = 1;
        } else if (ruleKey.equals("name")) {
            index = 2;
        }

        // Iterate over the items and count matches
        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue)) {
                count++;
            }
        }

        return count;
    }
}