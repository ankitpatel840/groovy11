import org.yaml.snakeyaml.Yaml

class YmalCheak
{

    public static void main(String[] args) {


        Yaml yaml = new Yaml();
        InputStream inputStream = this.getClass()
                .getClassLoader()
                .getResourceAsStream("application.yml");
        Map<String, Object> obj = yaml.load(inputStream);
        System.out.println(obj);
    }
}
