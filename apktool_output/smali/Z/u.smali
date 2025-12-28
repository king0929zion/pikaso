.class public abstract Lz/u;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp/G;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lp/G;

    sget-object v1, Lp/s;->b:LX/d;

    const/4 v2, 0x0

    const/16 v3, 0xf

    invoke-direct {v0, v3, v2, v1}, Lp/G;-><init>(IILp/r;)V

    sput-object v0, Lz/u;->a:Lp/G;

    return-void
.end method
