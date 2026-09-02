class Solution {

    public String sortVowels(String s) {
        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ("aeiouAEIOU".indexOf(ch) != -1) {
                list.add(ch);
            }
        }

        Collections.sort(list);

        char[] arr = s.toCharArray();
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if ("aeiouAEIOU".indexOf(arr[i]) != -1) {
                arr[i] = list.get(j++);
            }
        }

        return new String(arr);
    }
}

   