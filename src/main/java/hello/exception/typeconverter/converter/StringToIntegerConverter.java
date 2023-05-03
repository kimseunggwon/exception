package hello.exception.typeconverter.converter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;

/** Converter 는 범용(객체 -> 객체)
 *  Formatter 는 문자에 특화(객체 -> 문자, 문자 -> 객체) + 현지화(Locale)
 */
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
