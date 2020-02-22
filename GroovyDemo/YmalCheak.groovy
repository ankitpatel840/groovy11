import org.yaml.snakeyaml.Yaml

class YmalCheak
{


    public static void main(String[] args) {


        Yaml yaml = new Yaml();
        InputStream inputStream = this.getResourceAsStream("customer.yaml");
        Map<String, Object> obj = yaml.load(inputStream);
       println obj





    }
}
