.class public abstract Ll0/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LD/H;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Ll0/l;->e:Ll0/l;

    sget-object v1, LD/U;->i:LD/U;

    new-instance v2, LD/H;

    invoke-direct {v2, v1, v0}, LD/H;-><init>(LD/H0;Lo2/a;)V

    sput-object v2, Ll0/m;->a:LD/H;

    return-void
.end method
