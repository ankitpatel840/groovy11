import org.yaml.snakeyaml.Yaml

class Basic {
    def static ctc = [:]

    def static ctc1 = [:]

    static void main(String[] args) {

        Yaml yaml = new Yaml()
        InputStream inputStream = this.getResourceAsStream("application.yml")
        Map<String, Object> obj = yaml.load(inputStream)
        println obj
        for(o in obj.structure){
            println(o)

            ctc.put(o,0)

        }
        println(ctc)
        basicCal("basic",4)
        basicCal("bonus",34)
       basicCal("firstName",40045)

        println ctc1

        ctc1.put("firstName","Ankit")
        println ctc1



    }



    static def basicCal(String cmop,Integer a)
    {
        ctc.put(cmop,a)
        println(ctc)
    }

}
