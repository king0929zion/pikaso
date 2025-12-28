.class public final LC0/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LA/t;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LA/t;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LA/t;-><init>(IZ)V

    invoke-static {}, Lo1/i;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, LA/t;->x()LD/L0;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-object v1, v0, LA/t;->e:Ljava/lang/Object;

    sput-object v0, LC0/i;->a:LA/t;

    return-void
.end method
