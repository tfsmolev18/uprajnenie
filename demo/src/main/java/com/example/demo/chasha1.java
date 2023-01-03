import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;


@Controller
public class chasha1{
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @GetMapping("/Table_1")
    public String index(Model model) {

        String sql = "SELECT * FROM Table_1";
        List<Table_1> Table_1s = jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(Table_1.class));

        model.addAttribute("table_1", table_1s);
        return "table_1s/index";
    }
}