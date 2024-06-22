@RestController
@RequestMapping("/api")
public class ExemploController {

    @GetMapping("/hello")
    public ResponseEntity<String> getHello() {
        return ResponseEntity.ok("Hello, World!");
    }
}
