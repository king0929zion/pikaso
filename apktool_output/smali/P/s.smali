.class public abstract Lp/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp/q;

.field public static final b:LX/d;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lp/q;

    const v1, 0x3ecccccd    # 0.4f

    const v2, 0x3e4ccccd    # 0.2f

    invoke-direct {v0, v1, v2}, Lp/q;-><init>(FF)V

    sput-object v0, Lp/s;->a:Lp/q;

    new-instance v0, Lp/q;

    const/4 v3, 0x0

    invoke-direct {v0, v3, v2}, Lp/q;-><init>(FF)V

    new-instance v0, Lp/q;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2}, Lp/q;-><init>(FF)V

    new-instance v0, LX/d;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, LX/d;-><init>(I)V

    sput-object v0, Lp/s;->b:LX/d;

    return-void
.end method
