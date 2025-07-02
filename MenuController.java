@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/menu")
public class MenuController {
     @Autowired
    private MenuService service;

    @GetMapping
    public List<MenuItem> getMenu() {
        return service.getAllMenuItems();
    }
}
