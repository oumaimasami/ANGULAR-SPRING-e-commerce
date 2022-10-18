package Learning.ECommerce.Entity;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="ProductCategory")
@Data
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;

    @Column(name = "categoryName")
    private String categoryName;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "category")
    private Set<Product> products;


}
