
package co.edu.usa.demo.controller;

import co.edu.usa.demo.entities.Product;
import co.edu.usa.demo.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
    
    @Autowired
    private ProductService productService;
    
    @GetMapping("/all")
    public List<Product> getAll(){
        return productService.getAll();
    }
    @PostMapping("/save")
    public Product save(@RequestBody Product p){
        return productService.save(p);
    }
}
