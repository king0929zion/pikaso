.class public abstract LB/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp/G;

.field public static final b:Lp/G;

.field public static final c:Lp/G;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lp/q;

    const v1, 0x3f19999a    # 0.6f

    const v2, 0x3ecccccd    # 0.4f

    invoke-direct {v0, v2, v1}, Lp/q;-><init>(FF)V

    new-instance v1, Lp/G;

    sget-object v2, Lp/s;->a:Lp/q;

    const/16 v3, 0x78

    const/4 v4, 0x0

    invoke-direct {v1, v3, v4, v2}, Lp/G;-><init>(IILp/r;)V

    sput-object v1, LB/b;->a:Lp/G;

    new-instance v1, Lp/G;

    const/16 v2, 0x96

    invoke-direct {v1, v2, v4, v0}, Lp/G;-><init>(IILp/r;)V

    sput-object v1, LB/b;->b:Lp/G;

    new-instance v1, Lp/G;

    invoke-direct {v1, v3, v4, v0}, Lp/G;-><init>(IILp/r;)V

    sput-object v1, LB/b;->c:Lp/G;

    return-void
.end method
