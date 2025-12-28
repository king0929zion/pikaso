.class public abstract LA/w;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LD/M0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, LA/p;->i:LA/p;

    invoke-static {v0}, LZ/b;->C(Lo2/a;)Lc2/k;

    sget-object v0, LA/p;->j:LA/p;

    new-instance v1, LD/M0;

    invoke-direct {v1, v0}, LD/k0;-><init>(Lo2/a;)V

    sput-object v1, LA/w;->a:LD/M0;

    return-void
.end method
