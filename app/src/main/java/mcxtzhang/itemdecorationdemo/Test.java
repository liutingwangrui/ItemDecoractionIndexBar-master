package mcxtzhang.itemdecorationdemo;

import com.github.stuxuhai.jpinyin.PinyinException;
import com.github.stuxuhai.jpinyin.PinyinFormat;
import com.github.stuxuhai.jpinyin.PinyinHelper;

public class Test  {
    public static void main(String [] args){
        try {
            String s = PinyinHelper.convertToPinyinString("长春", "");
            String s2 = PinyinHelper.convertToPinyinString("长春你好啊","",PinyinFormat.WITHOUT_TONE);
            System.out.println(s+"----"+s2);
        } catch (PinyinException e) {
            e.printStackTrace();
        }

    }
}
