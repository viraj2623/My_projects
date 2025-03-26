package First;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class EmpService {

		public IEmp iemp;
		@Autowired
		public EmpService(@Qualifier("empDAO")IEmp iemp2)
		{
			this.iemp=iemp2;
		}
		
		public Emp getEmp(int id) {
			
			return iemp.getEmp(id);
		}
		
		public void getEmp1(int id) {
			
			 iemp.getEmp1(id);
		}
}
