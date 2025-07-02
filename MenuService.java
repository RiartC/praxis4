@Service
public class MenuService {
    @Autowired
    private MenuItemRepository repo;

    public List<MenuItem> getAllMenuItems() {
        return repo.findAll();
    }
}
