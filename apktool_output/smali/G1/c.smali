.class public abstract LG1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LL/a;

.field public static final b:LL/a;

.field public static final c:LL/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget-object v0, LG1/a;->f:LG1/a;

    new-instance v1, LL/a;

    const v2, 0x5001d961

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3, v0}, LL/a;-><init>(IZLp2/h;)V

    sput-object v1, LG1/c;->a:LL/a;

    sget-object v0, LG1/a;->g:LG1/a;

    new-instance v1, LL/a;

    const v2, -0x3f00b4b

    invoke-direct {v1, v2, v3, v0}, LL/a;-><init>(IZLp2/h;)V

    sput-object v1, LG1/c;->b:LL/a;

    sget-object v0, LG1/b;->e:LG1/b;

    new-instance v1, LL/a;

    const v2, 0x3f338c64

    invoke-direct {v1, v2, v3, v0}, LL/a;-><init>(IZLp2/h;)V

    sput-object v1, LG1/c;->c:LL/a;

    return-void
.end method
