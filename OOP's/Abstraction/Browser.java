public class Browser {
    public void navigate(String address){
        String ip = findIpAddress(address);
        String html = sendHttpRequest(ip);
        System.out.println("html="+html+"\nip="+ip);
    }

    private String sendHttpRequest(String ip) {
        return "<html content>";
    }

    private String findIpAddress(String address) {
          return "121.1.01.110.00";
    }
}
