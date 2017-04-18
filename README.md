# JniDemo
(1)环境配置
1.SDK location 配置NDK路径->  H:\StudioSDK\ndk-bundle   ；
2.local.properties    配置->  ndk.dir=H\:\\StudioSDK\\ndk-bundle ;
3.gradle.properties   配置->  android.useDeprecatedNdk=true   ;// 兼容老Ndk
4.在build.gradle中-> defaultConfig{
		ndk {
            moduleName "jni_demo" //编译生成so库的名字，注意不要lib，和.so加进来  ,而且要和上面loadLibrary里面的参数一致
            abiFilters "armeabi","armeabi-v7a"//编译支持的平台
        }}
(2)开发流程:
1.在java里面写native代码
     static {
        System.loadLibrary("jni_demo"); //libjni_demo.so(不要lib不要.so);
    }
   public native String say();
 
2.在main目录下创建Jni目录,写C代码-生成头文件
  JNIEnv* env:里面有很多方法;
  jobject jobj:谁调用了这个方法就是谁的实例

3.配置动态链接库的名称
4.加载动态链接库
5.使用
