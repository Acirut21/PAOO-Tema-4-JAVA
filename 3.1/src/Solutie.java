public class Solutie {
    private String status;
    private Double x;

    public Solutie(String status, Double x) {
        this.status = status;
        this.x = x;
    }

    public String toJson() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        sb.append("  \"status\": \"").append(status).append("\",\n");
        sb.append("  \"x\": ").append(x == null ? "null" : x).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
