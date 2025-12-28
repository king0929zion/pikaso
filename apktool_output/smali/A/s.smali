.class public abstract LA/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LD/H;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, LA/p;->h:LA/p;

    sget-object v1, LD/U;->i:LD/U;

    new-instance v2, LD/H;

    invoke-direct {v2, v1, v0}, LD/H;-><init>(LD/H0;Lo2/a;)V

    sput-object v2, LA/s;->a:LD/H;

    return-void
.end method
