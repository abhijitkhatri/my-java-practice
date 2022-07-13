{\rtf1\ansi\ansicpg1252\cocoartf2638
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset0 Menlo-Regular;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue255;\red255\green255\blue254;\red0\green0\blue0;
\red144\green1\blue18;\red22\green107\blue41;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c100000;\cssrgb\c100000\c100000\c99608;\cssrgb\c0\c0\c0;
\cssrgb\c63922\c8235\c8235;\cssrgb\c7451\c48627\c21176;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs30 \cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 import\cf0 \strokec4 \'a0java.io.*;\cb1 \
\cf2 \cb3 \strokec2 import\cf0 \strokec4 \'a0java.math.*;\cb1 \
\cf2 \cb3 \strokec2 import\cf0 \strokec4 \'a0java.security.*;\cb1 \
\cf2 \cb3 \strokec2 import\cf0 \strokec4 \'a0java.text.*;\cb1 \
\cf2 \cb3 \strokec2 import\cf0 \strokec4 \'a0java.util.*;\cb1 \
\cf2 \cb3 \strokec2 import\cf0 \strokec4 \'a0java.util.concurrent.*;\cb1 \
\cf2 \cb3 \strokec2 import\cf0 \strokec4 \'a0java.util.regex.*;\cb1 \
\
\cf2 \cb3 \strokec2 public\cf0 \strokec4 \'a0\cf2 \strokec2 class\cf0 \strokec4 \'a0Solution\'a0\{\cb1 \
\
\
\
\pard\pardeftab720\partightenfactor0
\cf0 \cb3 \'a0\'a0\'a0\'a0\cf2 \strokec2 private\cf0 \strokec4 \'a0\cf2 \strokec2 static\cf0 \strokec4 \'a0\cf2 \strokec2 final\cf0 \strokec4 \'a0Scanner\'a0scanner\'a0=\'a0\cf2 \strokec2 new\cf0 \strokec4 \'a0Scanner(System.in);\cb1 \
\
\cb3 \'a0\'a0\'a0\'a0\cf2 \strokec2 public\cf0 \strokec4 \'a0\cf2 \strokec2 static\cf0 \strokec4 \'a0\cf2 \strokec2 void\cf0 \strokec4 \'a0main(String[]\'a0args)\'a0\{\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 int\cf0 \strokec4 \'a0N\'a0=\'a0scanner.nextInt();\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0scanner.skip(\cf5 \strokec5 "(\\r\\n|[\\n\\r\\u2028\\u2029\\u0085])?"\cf0 \strokec4 );\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 \strokec2 if\cf0 \strokec4 (N%\cf6 \strokec6 2\cf0 \strokec4 \'a0!=\'a0\cf6 \strokec6 0\cf0 \strokec4 )\{\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0System.out.println(\cf5 \strokec5 "Weird"\cf0 \strokec4 );\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}\cf2 \strokec2 else\cf0 \strokec4 \'a0\cf2 \strokec2 if\cf0 \strokec4 (N>=\cf6 \strokec6 2\cf0 \strokec4 \'a0&&\'a0N<=\cf6 \strokec6 5\cf0 \strokec4 \'a0&&\'a0N%\cf6 \strokec6 2\cf0 \strokec4 \'a0==\cf6 \strokec6 0\cf0 \strokec4 )\{\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0System.out.println(\cf5 \strokec5 "Not\'a0Weird"\cf0 \strokec4 );\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}\cf2 \strokec2 else\cf0 \strokec4 \'a0\cf2 \strokec2 if\cf0 \strokec4 (N>=\cf6 \strokec6 6\cf0 \strokec4 \'a0&&\'a0N<=\cf6 \strokec6 20\cf0 \strokec4 \'a0&&\'a0N%\cf6 \strokec6 2\cf0 \strokec4 \'a0==\cf6 \strokec6 0\cf0 \strokec4 )\{\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0System.out.println(\cf5 \strokec5 "Weird"\cf0 \strokec4 );\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}\cf2 \strokec2 else\cf0 \strokec4 \'a0\cf2 \strokec2 if\cf0 \strokec4 (N>\cf6 \strokec6 20\cf0 \strokec4 \'a0&&\'a0N%\cf6 \strokec6 2\cf0 \strokec4 \'a0==\cf6 \strokec6 0\cf0 \strokec4 )\{\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0System.out.println(\cf5 \strokec5 "Not\'a0Weird"\cf0 \strokec4 );\cb1 \
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}\cb1 \
\
\cb3 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0scanner.close();\cb1 \
\cb3 \'a0\'a0\'a0\'a0\}\cb1 \
\cb3 \}\cb1 \
\
}