.class public final LZ/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LZ/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LZ/l;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LZ/l;->a:LZ/l;

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Outline;LW/C;)V
    .locals 1

    instance-of v0, p2, LW/i;

    if-eqz v0, :cond_0

    check-cast p2, LW/i;

    iget-object p2, p2, LW/i;->a:Landroid/graphics/Path;

    invoke-static {p1, p2}, LG1/i;->o(Landroid/graphics/Outline;Landroid/graphics/Path;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Unable to obtain android.graphics.Path"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
