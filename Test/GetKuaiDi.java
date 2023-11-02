//package Test;
//import java.io.IOException;
//import java.security.MessageDigest;
//import java.security.NoSuchAlgorithmException;
//import java.util.HashMap;
//import java.util.Map;
//
//import okhttp3.MediaType;
//import okhttp3.OkHttpClient;
//import okhttp3.Request;
//import okhttp3.RequestBody;
//import okhttp3.Response;
//
//public class GetKuaiDi {
//
//
//
//public class KuaidiQuery {
//
//    public static String getKuaidi(String com, String num, String phone) throws NoSuchAlgorithmException, IOException {
//        String param = "{\"com\":\"" + com + "\",\"num\":\"" + num + "\",\"phone\":\"" + phone + "\"}";
//        String key = "AiQVqTwp8674";
//        String customer = "AC60A92092A3BAC7B15D5EE16F648A9E";
//        String message = param + key + customer;
//        String sign = md5(message).toUpperCase();
//        System.out.println("src: " + message);
//        System.out.println("MD5: " + sign);
//
//        // URL
//        String url = "https://poll.kuaidi100.com/poll/query.do?customer=" + customer + "&sign=" + sign + "&param=" + param;
//
//        OkHttpClient client = new OkHttpClient();
//
//        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
//        RequestBody body = RequestBody.create(mediaType, "");
//        Request request = new Request.Builder()
//                .url(url)
//                .post(body)
//                .addHeader("Content-Type", "application/x-www-form-urlencoded")
//                .build();
//
//        Response response = client.newCall(request).execute();
//        String responseBody = response.body().string();
//
//        Map<String, Object> jsonData = new HashMap<>();
//        jsonData = new Gson().fromJson(responseBody, jsonData.getClass());
//        List<Map<String, String>> liDic = (List<Map<String, String>>) jsonData.get("data");
//
//        List<String> result = new ArrayList<>();
//        for (Map<String, String> item : liDic) {
//            String joinedValues = String.join(" ", item.values());
//            result.add(joinedValues);
//        }
//
//        return String.join("\n", result);
//    }
//
//    private static String md5(String message) throws NoSuchAlgorithmException {
//        MessageDigest digest = MessageDigest.getInstance("MD5");
//        digest.update(message.getBytes());
//        byte[] hashBytes = digest.digest();
//
//        StringBuilder hexString = new StringBuilder();
//        for (byte hashByte : hashBytes) {
//            String hex = Integer.toHexString(0xFF & hashByte);
//            if (hex.length() == 1) {
//                hexString.append('0');
//            }
//            hexString.append(hex);
//        }
//
//        return hexString.toString();
//    }
//
//    public static void main(String[] args) {
//        try {
//            String result = getKuaidi("zhongtong", "78706005393526", "15085084938");
//            System.out.println(result);
//        } catch (NoSuchAlgorithmException | IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
//}