use jni::JNIEnv;

#[no_mangle]
pub extern "system" fn Java_fr_stardustenterprises_rust_test_Main_rustNative(_env: JNIEnv) {
    println!("Heya from Rust!");
}

