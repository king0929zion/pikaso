.class public abstract LO/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LD/M0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, LO/a;->e:LO/a;

    new-instance v1, LD/M0;

    invoke-direct {v1, v0}, LD/k0;-><init>(Lo2/a;)V

    sput-object v1, LO/b;->a:LD/M0;

    return-void
.end method
