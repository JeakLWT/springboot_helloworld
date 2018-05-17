package holder;

import com.spay.SpringContextHolder;
import com.spay.bean.MyBean;

public class MyHolder {
    public void getBean(){
        System.out.println(SpringContextHolder.getBean(MyBean.class));

    }
}
