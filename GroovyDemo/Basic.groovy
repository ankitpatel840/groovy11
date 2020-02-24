import org.springframework.beans.factory.annotation.Value
import org.yaml.snakeyaml.Yaml

class Basic {

      Integer basic;
    Integer  bonus;

    def static ctc = [:]

    def static ctc1 = [:]

    static void main(String[] args) {
       Basic basic1= new Basic();
        Yaml yaml = new Yaml()
       // FileInputStream inputStreamm= new FileInputStream("/home/ankit/Downloads/groovy/src/main/resources/ctc.yml")
        InputStream inputStream = this.getResourceAsStream("ctc.yml")
        Map<String, Object> obj = yaml.load(inputStream)
//              println obj
        obj.structure.each {
//            basicCal(it,0)
            obj.put("",06)
//            println it
        }
        println obj
//                    basic1.setBasic(23);
//         obj.put("basic",basic1.getBasic() )
//        println(obj)


//        println obj
//        for(o in obj.structure){
//
//
//
//
//
//        }
     //   println(ctc)
//        basicCal("basic",4)
//        basicCal("bonus",34)
//
//        basicCal("dfdfd",45)
//        println ctc1




    }



    static def basicCal(String cmop,Integer a)
    {
        ctc.put(cmop,a)
//        println(ctc)
        }
}

