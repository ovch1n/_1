package Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Контроллер для главной страницы приложения.
 */

@Controller /**Аннотация @Controller говорит component-scan что нужно создать спринг-бин из этого класса (поэтому рекомендуется оставлять в нем конструктор по-умолчанию без параметров).  */
public class SimpleWebAppController {

    @RequestMapping(value = "/index", method = RequestMethod.POST)/**
     *Аннотация @RequestMapping говорит, что метод index будет обрабатывать запросы по URI /index от корня приложения (если приложение развернуто на сервере под контекстом /mvc то соответственно полный URL будет http://localhost:8080/mvc/index)
     * метод index (название произвольное, главное чтобы он был public) принимает на вход объект модели, которую может заполнить в теле метода, и возвращает String - имя jsp страницы, которая представляет собой view
     */
    public String Calculate(@RequestParam double ch1, @RequestParam double ch2, Model model) {
        model.addAttribute("otvet", ch1 / ch2);
        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String initData() { /**запускает параметр*/

        return "index";
    }

}