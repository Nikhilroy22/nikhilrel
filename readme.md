// create apk


keytool -genkey -v -keystore my-release-key.jks -keyalg RSA -keysize 2048 -validity 10000 -alias my-key-alias



//apksign



apksigner sign --ks my-release-key.jks --out signed.apk app-release-unsigned.apk







echo "# Anikhil" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/Nikhilroy22/Anikhil.git
git push -u origin main





git remote add origin https://github.com/Nikhilroy22/Anikhil.git
git branch -M main
git push -u origin main