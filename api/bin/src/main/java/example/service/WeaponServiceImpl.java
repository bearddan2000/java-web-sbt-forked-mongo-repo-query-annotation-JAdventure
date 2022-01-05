package example.service;

import example.model.Weapon;
import example.repository.WeaponRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;
// import static java.util.stream.Collectors.toList;
// import static java.util.stream.Collectors.collectingAndThen;

import java.util.List;

/**
 * @author ragcrix
 */
@Service
public class WeaponServiceImpl implements WeaponService {

    @Autowired
    private WeaponRepository weaponRepository;

    @Override
    public List<Weapon> findAll() {
        return weaponRepository.findAll();
    }

    @Override
    public Weapon findByName(String name) {
      /*
        List<Weapon> lst = weaponRepository.findAll();
        for(Weapon x : lst)
          if(x.getName().equals(name))
            return x;

        return null;
        */
        return weaponRepository.findByName(name);
    }
}
