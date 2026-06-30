class Solution {

    public String encode(List<String> strs) {
        String encoded_string = "";
        for(String s: strs){
            encoded_string += Integer.toString(s.length()) + "#" + s;
        }

        return encoded_string;
    }

    public List<String> decode(String str) {
        List<String> decoded_strs = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int index = str.indexOf('#', i);
            int len = Integer.parseInt(str.substring(i, index));
            String word = str.substring(index + 1, index + len + 1);
            decoded_strs.add(word);
            i = index + len + 1;
        }

        return decoded_strs;
    }
}
