package pixel.academy.wizard_app.rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MagicRestControler {
    @Value("${wizard.name}")
    private String wizardName;


            @Value("${wizardhouse}")
            private String wizardHouse;

    @Value("${wizard.spell}")
    private String wizardSpell;

    @GetMapping("/team")
    public String getTeamInfo(){
        return  "wizard name :" +wizardName +
                "wizard house :" +wizardHouse +
                "wizard spell :" +wizardSpell;
    }


}
