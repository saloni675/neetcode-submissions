class Solution {

    public String encode(List<String> strs) {
       StringBuilder sb = new StringBuilder();

        for (String s : strs) {
            sb.append(s.length()).append("#").append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
     List<String> result = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int j = i;

            // Find the delimiter that ends the length
            while (str.charAt(j) != '#') {
                j++;
            }

            // Read the length of the next string
            int len = Integer.parseInt(str.substring(i, j));

            // Extract the original string
            String s = str.substring(j + 1, j + 1 + len);
            result.add(s);

            // Move to the next encoded string
            i = j + 1 + len;
        }

        return result;
    }
}
