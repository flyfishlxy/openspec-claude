#!/usr/bin/env python3
import sys
import json

try:
    data = json.load(sys.stdin)
except:
    sys.exit(0)

path = data.get("tool_input", {}).get("file_path", "")

blocked = ["pom.xml"]

for b in blocked:
    if b in path:
        print("ERROR: protected file")
        sys.exit(2)

sys.exit(0)