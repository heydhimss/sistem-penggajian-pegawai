@echo off
echo Generating JavaDoc documentation...

REM Create docs directory if it doesn't exist
if not exist "docs" mkdir docs

REM Generate JavaDoc
javadoc -d docs -sourcepath src -subpackages main -encoding UTF-8 -charset UTF-8 -windowtitle "Sistem Penggajian Pegawai" -doctitle "Dokumentasi Sistem Penggajian Pegawai" -author -version -use

echo JavaDoc generation completed!
echo Open docs/index.html to view the documentation.
pause