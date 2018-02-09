package com.lucy.manager.utils;

public class CheckPW {
    /**
     * 验证是否匹配数据库密码
     * @param Account 账号名
     * @param PassWord 密码
     * @param Encryption_PassWord 加密密码
     * @return boolean
     */
    public static boolean IsLogin(String Account, String PassWord, String Encryption_PassWord){
        String MD5String = MD5Str(Account, PassWord);
        return MD5String.equals(Encryption_PassWord);
    }

    /**
     * MD5加密后字符串
     * @param Account 账号
     * @param PassWord 密码
     * @return 加密密码
     */
    public static String MD5Str(String Account, String PassWord){
        try {
            String Key = "account=" + Account + "&password=" + PassWord;
            return SecretBLL.GetMD5(Key);
        }catch (Exception ex){
            return null;
        }
    }
}
