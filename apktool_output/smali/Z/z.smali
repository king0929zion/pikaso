.class public abstract Lz/z;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LD/M0;

.field public static final b:Lz/h;

.field public static final c:Lz/h;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget-object v0, Lz/y;->e:Lz/y;

    new-instance v1, LD/M0;

    invoke-direct {v1, v0}, LD/k0;-><init>(Lo2/a;)V

    sput-object v1, Lz/z;->a:LD/M0;

    new-instance v0, Lz/h;

    const v1, 0x3e23d70a    # 0.16f

    const v2, 0x3e75c28f    # 0.24f

    const v3, 0x3da3d70a    # 0.08f

    invoke-direct {v0, v1, v2, v3, v2}, Lz/h;-><init>(FFFF)V

    sput-object v0, Lz/z;->b:Lz/h;

    new-instance v0, Lz/h;

    const v1, 0x3df5c28f    # 0.12f

    const v2, 0x3d23d70a    # 0.04f

    invoke-direct {v0, v3, v1, v2, v1}, Lz/h;-><init>(FFFF)V

    sput-object v0, Lz/z;->c:Lz/h;

    return-void
.end method
