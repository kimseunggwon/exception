package hello.exception.typeconverter.converter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;

@Slf4j
public class StringToIntegerConverter implements Converter<String,Integer> {

    
    /**   String ---> Integer
     */
    @Override
    public Integer convert(String source) {
        log.info("convert cource={}",source);
        return Integer.valueOf(source);
    }


}
