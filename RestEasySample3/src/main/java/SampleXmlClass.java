import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="sampleXml")
@XmlAccessorType(XmlAccessType.FIELD)
public class SampleXmlClass {
    String elem1;
    String elem2;
    String elem3;
}
