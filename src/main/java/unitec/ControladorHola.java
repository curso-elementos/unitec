/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author campitos
 */
@Controller
@RequestMapping("/")
public class ControladorHola {
    
    @RequestMapping(value="/mensaje", method=RequestMethod.GET,
            headers={"Accept=text/html"})
    @ResponseBody
    public String cualquierNombre(){
        String mensajito= "todos vamos a morir!!!";
        return  mensajito;
    }
    
}















