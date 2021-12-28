package org.ravi.codingprac.serviceimpl.codewars;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.text.WordUtils;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
@Slf4j
public class JadeCasingStringsImpl {
    String output;

    public String toJadenCase(String phrase) {
        if ((null == phrase) || phrase.length() == 0) {
            this.output = null;
        } else {
            this.output = "";
            for (String element :
                    phrase.split(" ")) {
                this.output = this.output + Character.toUpperCase(element.charAt(0)) + element.substring(1).toLowerCase(Locale.ROOT) + " ";
            }
            this.output = this.output.replace("\\s++", "\\s");
            this.output = this.output.replaceFirst("^\\s", "");
            this.output = this.output.replaceFirst("\\s$", "");
        }
        return this.output;
    }

    public String toJadenCaseApache(String input) {

        if (null == input) {
            output = null;
        } else if (input.length() == 0) {
            output = null;
        } else {
            output = WordUtils.capitalizeFully(input);
        }
        return output;
    }
}
