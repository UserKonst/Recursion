
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author konst
 */
public class StreamsTut {

    public static void main(String[] args) {
        List<String> values = Stream.of("1", "1", "2")
                .distinct()
                .collect(Collectors.toList());

        for (String value : values) {
            System.out.println(value);
        }
        
    }
}
