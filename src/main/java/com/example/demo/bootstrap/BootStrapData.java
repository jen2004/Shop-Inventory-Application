package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.HashSet;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */

        if (partRepository.count() == 0 && outsourcedPartRepository.count() == 0 && productRepository.count() == 0) {

            InhousePart mediumBase = new InhousePart();
            mediumBase.setName("Medium House Base");
            mediumBase.setInv(15);
            mediumBase.setPrice(150.00);
            mediumBase.setId(1);
            mediumBase.setMinInv(5);
            mediumBase.setMaxInv(75);

            InhousePart largeBase = new InhousePart();
            largeBase.setName("Large House Base");
            largeBase.setInv(15);
            largeBase.setPrice(200.00);
            largeBase.setId(2);
            largeBase.setMinInv(5);
            largeBase.setMaxInv(75);

            InhousePart shingleRoof = new InhousePart();
            shingleRoof.setName("Shingle Roof");
            shingleRoof.setInv(15);
            shingleRoof.setPrice(39.99);
            shingleRoof.setId(3);
            shingleRoof.setMinInv(5);
            shingleRoof.setMaxInv(75);

            InhousePart metalRoof = new InhousePart();
            metalRoof.setName("Metal Roof");
            metalRoof.setInv(15);
            metalRoof.setPrice(49.99);
            metalRoof.setId(4);
            metalRoof.setMinInv(5);
            metalRoof.setMaxInv(75);

            InhousePart largeDogBed = new InhousePart();
            largeDogBed.setName("Large Dog Bed");
            largeDogBed.setInv(15);
            largeDogBed.setPrice(29.99);
            largeDogBed.setId(5);
            largeDogBed.setMinInv(5);
            largeDogBed.setMaxInv(75);

            InhousePart mediumDogBed = new InhousePart();
            mediumDogBed.setName("Medium Dog Bed");
            mediumDogBed.setInv(15);
            mediumDogBed.setPrice(19.99);
            mediumDogBed.setId(6);
            mediumDogBed.setMinInv(5);
            mediumDogBed.setMaxInv(75);

            InhousePart frontPorch = new InhousePart();
            frontPorch.setName("Front Porch");
            frontPorch.setInv(15);
            frontPorch.setPrice(49.99);
            frontPorch.setId(7);
            frontPorch.setMinInv(5);
            frontPorch.setMaxInv(75);

            partRepository.save(mediumBase);
            partRepository.save(largeBase);
            partRepository.save(shingleRoof);
            partRepository.save(metalRoof);
            partRepository.save(largeDogBed);
            partRepository.save(mediumDogBed);
            partRepository.save(frontPorch);


            OutsourcedPart heater = new OutsourcedPart();
            heater.setName("600W Heater");
            heater.setPrice(55.99);
            heater.setInv(15);
            heater.setCompanyName("Chtoocy");
            heater.setId(8);
            heater.setMinInv(5);
            heater.setMaxInv(75);

            OutsourcedPart largeFoodBowl = new OutsourcedPart();
            largeFoodBowl.setName("Large Food Bowl");
            largeFoodBowl.setPrice(12.89);
            largeFoodBowl.setInv(15);
            largeFoodBowl.setCompanyName("Van Ness");
            largeFoodBowl.setId(9);
            largeFoodBowl.setMinInv(5);
            largeFoodBowl.setMaxInv(75);

            OutsourcedPart mediumFoodBowl = new OutsourcedPart();
            mediumFoodBowl.setName("Medium Food Bowl");
            mediumFoodBowl.setPrice(8.79);
            mediumFoodBowl.setInv(15);
            mediumFoodBowl.setCompanyName("Van Ness");
            mediumFoodBowl.setId(10);
            mediumFoodBowl.setMinInv(5);
            mediumFoodBowl.setMaxInv(75);

            OutsourcedPart gravityFoodBowl = new OutsourcedPart();
            gravityFoodBowl.setName("Gravity Food Bowl");
            gravityFoodBowl.setPrice(18.99);
            gravityFoodBowl.setInv(15);
            gravityFoodBowl.setCompanyName("Amazon Basics");
            gravityFoodBowl.setId(11);
            gravityFoodBowl.setMinInv(5);
            gravityFoodBowl.setMaxInv(75);

            OutsourcedPart gravityWaterer = new OutsourcedPart();
            gravityWaterer.setName("Gravity Waterer");
            gravityWaterer.setPrice(19.94);
            gravityWaterer.setInv(15);
            gravityWaterer.setCompanyName("Amazon Basics");
            gravityWaterer.setId(12);
            gravityWaterer.setMinInv(5);
            gravityWaterer.setMaxInv(75);

            outsourcedPartRepository.save(heater);
            outsourcedPartRepository.save(largeFoodBowl);
            outsourcedPartRepository.save(mediumFoodBowl);
            outsourcedPartRepository.save(gravityFoodBowl);
            outsourcedPartRepository.save(gravityWaterer);

        Product toto = new Product("The Toto",266.0,15);
        Product lassie = new Product("The Lassie",355.0,15);
        Product spot = new Product("The Spot",326.0,15);
        Product fido = new Product("The Fido",359.0,15);
        Product clifford = new Product("The Clifford",425.0,15);

        productRepository.save(toto);
        productRepository.save(lassie);
        productRepository.save(spot);
        productRepository.save(fido);
        productRepository.save(clifford);

        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
    }
