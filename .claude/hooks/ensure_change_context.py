#!/usr/bin/env python3
import os
import sys

path = "openspec/changes"

if not os.path.exists(path):
    print("ERROR: no openspec")
    sys.exit(2)

dirs = [d for d in os.listdir(path) if d != "archive"]

if not dirs:
    print("ERROR: no active change")
    sys.exit(2)

sys.exit(0)