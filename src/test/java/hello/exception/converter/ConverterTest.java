package hello.exception.converter;


import hello.exception.typeconverter.converter.StringToIntegerConverter;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConverterTest {

    /**   String ---> Integer  테스트
     */
    @Test
    void stringToInteger() {
        StringToIntegerConverter converter = new StringToIntegerConverter();
        Integer result = converter.convert("10");

        Assertions.assertThat(result).isEqualTo(10);
    }
}
